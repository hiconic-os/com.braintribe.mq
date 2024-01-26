// ============================================================================
// Copyright BRAINTRIBE TECHNOLOGY GMBH, Austria, 2002-2022
// 
// This library is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either version 3 of the License, or (at your option) any later version.
// 
// This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more details.
// 
// You should have received a copy of the GNU Lesser General Public License along with this library; See http://www.gnu.org/licenses/.
// ============================================================================
package com.braintribe.transport.messaging.mq.test;

import com.braintribe.transport.messaging.mq.test.config.TestConfiguration;

public class ConfigurationHolder {

	public static TestConfiguration testConfiguration = testConfiguration();

	// NOTE: This used to be configured via Spring. I replaced it with java, but didn't test it (not sure what it actually needs to run).
	private static TestConfiguration testConfiguration() {
		TestConfiguration result = new TestConfiguration();
		result.setHost("10.202.1.1");
		result.setPort(1414);
		result.setChannel("SYSTEM.ADMIN.SVRCONN");
		result.setQueueManager("MQE");
		result.setQueueName("tf.dev.queue.remoteToDbl");
		result.setTopicName("tf.dev.topic.heartbeat");

		return result;
	}

}
