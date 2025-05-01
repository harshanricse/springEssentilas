package com.infy.service;

import com.infy.dto.CustomerLoginDTO;
import com.infy.exception.InfyTelException;

public interface CustomerLoginService {

	public String authenticateCustomer(CustomerLoginDTO customerLogin) throws InfyTelException;

}
