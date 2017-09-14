package com.liferay.azure;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.management.Azure;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.credentials.UserTokenCredentials;

import java.io.File;
import java.io.IOException;

public class AzureMain {

	public static void main(String[] args) throws IOException {
		String clientID = args[0];
		String domain = args[1];
		String password = args[2];
		String username = args[3];

		AzureTokenCredentials azureTokenCredentials = new UserTokenCredentials(
			clientID, domain, username, password, AzureEnvironment.AZURE);

		Azure azure = Azure.authenticate(azureTokenCredentials).withDefaultSubscription();
	}

}