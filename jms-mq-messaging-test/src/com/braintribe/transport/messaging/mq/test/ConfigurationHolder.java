// ============================================================================
// Copyright BRAINTRIBE TECHNOLOGY GMBH, Austria, 2002-2022
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
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
