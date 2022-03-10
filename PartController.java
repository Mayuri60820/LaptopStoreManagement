package com.edu.LaptopStore.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.LaptopStore.Entity.Laptop;
import com.edu.LaptopStore.Entity.Parts;
import com.edu.LaptopStore.Services.PartServices;

@RestController
@RequestMapping("api/partTbl")
public class PartController {
	private PartServices partservices;

	public PartController(PartServices partservices) {
		super();
		this.partservices = partservices;
	}
	@PostMapping
	public ResponseEntity<Parts>SaveParts(@RequestBody Parts part)
	{
		return new ResponseEntity<Parts>(partservices.SaveParts(part),HttpStatus.CREATED);
	}
	@GetMapping
	public List<Parts>getPartsAll()
	{
		return partservices.getPartsAll();
	}
	@GetMapping("{partId}")
	public Optional<Parts> getPartsBypartid(@PathVariable("partId") long partId)
	{
		return partservices.getPartsBypartid(partId);
	}
	@PutMapping("{partId}")
	public ResponseEntity<Parts> updateParts(@PathVariable("partId") long partId, @RequestBody Parts part){
		
		return new ResponseEntity<Parts>(partservices.updateParts(part, partId),HttpStatus.OK);		
	}
	 @DeleteMapping("{partId}")
	  public ResponseEntity<String> deleteParts(@PathVariable("partId") long partId){
	    	partservices.deleteParts(partId);
	    	
	    	return new ResponseEntity<String>("Employee record deleted",HttpStatus.OK);  	
	    }
	 @PatchMapping("{partId}")
		public ResponseEntity<Parts> updatePartsPartially(@PathVariable("partId") long partId, @RequestBody Parts part){
			
			return new ResponseEntity<Parts>(partservices.updatePartsPartially(part, partId),HttpStatus.OK);		
		}
	 @GetMapping("/PartsByOrder")
	 public List<Parts> getPartsByOrder()
	 {
		 return partservices.getPartsByOrder();
	 }
}
