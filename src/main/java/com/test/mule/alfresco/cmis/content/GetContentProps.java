package com.test.mule.alfresco.cmis.content;

import org.apache.chemistry.opencmis.client.api.Document;
import org.mule.api.MuleEventContext;
import org.mule.api.MuleMessage;
import org.mule.api.lifecycle.Callable;

import com.test.mule.alfresco.cmis.bean.ContentPropsBean;

/**
 * Class to process CMIS object
 * 
 * @author niketa.patel
 */

public class GetContentProps implements Callable
{

	@Override
	public Object onCall(final MuleEventContext eventContext) throws Exception
	{

		final MuleMessage incomingMessage = eventContext.getMessage();

		final Document cmisAlfrescoDocObject = (Document) incomingMessage.getPayload();// get cmisObject

		final ContentPropsBean contentPropObject = new ContentPropsBean();

		contentPropObject.setTitle(cmisAlfrescoDocObject.getProperty("cm:title").getValueAsString());// set title
		contentPropObject.setName(cmisAlfrescoDocObject.getName()); // set name
		contentPropObject.setDescription(cmisAlfrescoDocObject.getProperty("cm:description").getValueAsString());// set description
		contentPropObject.setCreator(cmisAlfrescoDocObject.getProperty("cmis:createdBy").getValueAsString());// set created by

		return contentPropObject;
	}
}
