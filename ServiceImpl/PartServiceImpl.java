package com.edu.LaptopStore.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.edu.LaptopStore.Entity.Laptop;
import com.edu.LaptopStore.Entity.Parts;
import com.edu.LaptopStore.Exception.ResourceNotFound;
import com.edu.LaptopStore.Repository.PartRepository;
import com.edu.LaptopStore.Services.PartServices;

@Service
public class PartServiceImpl implements PartServices {
  private PartRepository partRepository;
  
	public PartServiceImpl(PartRepository partRepository) {
	super();
	this.partRepository = partRepository;
}

	@Override
	public Parts SaveParts(Parts part) {
		// TODO Auto-generated method stub
		return partRepository.save(part);
	}

	@Override
	public List<Parts> getPartsAll() {
		// TODO Auto-generated method stub
		return partRepository.findAll();
	}

	@Override
	public Optional<Parts> getPartsBypartid(long partId) {
		// TODO Auto-generated method stub
		return partRepository.findById(partId);
	}

	@Override
	public Parts updateParts(Parts part, long partId) {
		Parts obj = new Parts();
		 try {
			   obj = partRepository.findById(partId).orElseThrow(
					 ()-> 		 new ResourceNotFound("Parts","Id",partId));
		} catch (ResourceNotFound e) {
			
			e.printStackTrace();
		}
		 obj.setPartName(part.getPartName());
		 obj.setPartCompanyName(part.getPartCompanyName());
		 obj.setPartPrice(part.getPartPrice());
		 obj.setPartDescription(part.getPartDescription());;
		 
		 partRepository.save(obj);
		return obj;
	}

	@Override
	public void deleteParts(long partId) {
		partRepository.findById(partId).orElseThrow(
				()->        new ResourceNotFound("Parts","Id",partId));
  
		partRepository.deleteById(partId);
		
	}

	@Override
	public Parts updatePartsPartially(Parts part, long partId) {
		// TODO Auto-generated method stub
		Parts part1=new Parts();
		try {
		part1=partRepository.findById(partId).orElseThrow(
				() ->    new ResourceNotFound("Parts","Id",partId) );
		}catch(ResourceNotFound e) {
			e.printStackTrace();
		}
		if(part.getPartName() !=null)
		{
			part1.setPartName(part.getPartName());
		}
		if(part.getPartCompanyName() !=null)
		{
			part1.setPartCompanyName(part.getPartCompanyName());
		}
		if(part.getPartPrice() !=null)
		{
			part1.setPartPrice(part.getPartPrice());
		}
		if(part.getPartDescription() !=null)
		{
			part1.setPartDescription(part.getPartDescription());
		}
		partRepository.save(part1);
		
		return part1;
	}

	@Override
	public List<Parts> getPartsByOrder() {
		// TODO Auto-generated method stub
		return partRepository.FindByOrder();
	}

}
