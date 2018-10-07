package com.csse.ticketing.controllers;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.csse.ticketing.models.HaltModel;
import com.csse.ticketing.services.JourneyService;
import com.csse.ticketing.exceptions.BadRequestException;

/**
 * 
 * @author Kasun
 *
 */
@RestController
@RequestMapping(value="/halts")
public class HaltController {
	
	    @Autowired
	    JourneyService journeyService;
	
		/**
		 * service caller for create a new halt
		 * @param halt
		 * @return
		 */
	    @RequestMapping(method = RequestMethod.POST, produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
	    public HttpEntity<HaltModel> createHalt(@Validated @RequestBody final HaltModel halt) {
		 return new ResponseEntity<HaltModel>(journeyService.createHalt(halt), HttpStatus.CREATED);
	    }
	 
	    /**
	     * service caller for get a single halt
	     * @param haltId
	     * @return
	     */
	    @RequestMapping(value = "/{haltNo}", method = RequestMethod.GET, produces = APPLICATION_JSON_VALUE)
	    public HttpEntity<HaltModel> getHalt(@PathVariable("haltNo") final String haltId) {

	        return new ResponseEntity<HaltModel>(journeyService.getHalt(haltId), HttpStatus.OK);
	    }
	    
	    /**
	     * service caller for update a single halt
	     * @param haltNo
	     * @param halt
	     * @return
	     */
	    @RequestMapping(value = "/{haltNo}", method = RequestMethod.PUT, produces = APPLICATION_JSON_VALUE,
	            consumes = APPLICATION_JSON_VALUE)
	    public HttpEntity<HaltModel> updateHalt(@PathVariable("haltNo") final String haltNo,
	            @Validated @RequestBody final HaltModel halt) {

	        if (halt.getHaltNo() == null && !halt.getHaltNo().equals(haltNo)) {
	            throw new BadRequestException("Halt cant defined");
	        }

	        return new ResponseEntity<HaltModel>(journeyService.updateHalt(halt), HttpStatus.CREATED);
	    }
	  
	    /**
	     * service caller for delete a single halt
	     * @param haltNo
	     * @return
	     */
	    @RequestMapping(value = "/{haltNo}", method = RequestMethod.DELETE)
	    public HttpEntity<Void> deleteHalt(@PathVariable("haltNo") final String haltNo) {

	        journeyService.deleteHalt(haltNo);
	        
	        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	    }

}
