package com.edu.LaptopStore.Services;

import java.util.List;
import java.util.Optional;

import com.edu.LaptopStore.Entity.Parts;

public interface PartServices {

	Parts SaveParts(Parts part);

	List<Parts> getPartsAll();

	

	Parts updateParts(Parts part, long partId);

	void deleteParts(long partId);

	Optional<Parts> getPartsBypartid(long partId);

	Parts updatePartsPartially(Parts part, long partId);

	List<Parts> getPartsByOrder();

}
