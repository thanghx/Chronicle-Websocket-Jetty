/*
 * Copyright 2016 higherfrequencytrading.com
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package net.openhft.chronicle.websocket.jetty;

public class HelloWorldImpl implements HelloWorld {
    private final HelloReplier replier;

    public HelloWorldImpl(HelloReplier replier) {
        this.replier = replier;
    }

    @Override
    public void hello(String name) {
        System.out.println("hello(" + name + ")");
        replier.reply("Hello " + name);
    }
}
