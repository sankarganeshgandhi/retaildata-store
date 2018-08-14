package com.sgglabs.retail;

import com.sgglabs.retail.model.CustomSequence;
import com.sgglabs.retail.model.ProductSearchResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import javax.jms.TextMessage;

@Component
public class Receiver {
    private static final Logger LOG = LoggerFactory.getLogger(Receiver.class);

    /*@Autowired
    CustomSequence sequenceGenerator;*/

    /*@Autowired
    ProductSearchResultRepository repo;*/

    @JmsListener(destination = "SearchResultQ", containerFactory = "jmsFactory")
    public void receiveMessage(ProductSearchResult searchResult) {
        searchResult.setId(100L);//sequenceGenerator.getSequence());
        //repo.save(searchResult);
        LOG.debug("ProductSearchResult: " + searchResult.toString());
    }
}