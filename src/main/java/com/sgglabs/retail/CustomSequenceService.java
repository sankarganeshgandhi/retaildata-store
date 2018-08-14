package com.sgglabs.retail;

import com.sgglabs.retail.model.CustomSequence;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import static org.springframework.data.mongodb.core.FindAndModifyOptions.options;
import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

@Service
public class CustomSequenceService {
    private static final Logger LOG = LoggerFactory.getLogger(CustomSequenceService.class);

    @Autowired
    private MongoOperations mongoOperations;

    public long getNextSequence(String sequenceName) {
        CustomSequence sequence = mongoOperations.findAndModify(
                query(where("_id").is(sequenceName)),
                new Update().inc("sequence", 1),
                options().returnNew(true).upsert(true),
                CustomSequence.class
        );
        return sequence.getSequence();
    }
}