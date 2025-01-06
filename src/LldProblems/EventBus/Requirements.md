<H1>EventBus </h1>

An Event Bus is a messaging system used to facilitate communication between
different components or services in a software system.
It works as a central hub where events are published by event producers (or
publishers), and multiple event consumers (or subscribers) can listen for and
respond to those events.



<H2> Key Characteristics: </H2>
Decoupling: The event bus decouples components, meaning that the producer of the event doesn't need to know which components will consume it. This allows for more modular and maintainable code.
Publish-Subscribe Pattern: The event bus operates on the publish-subscribe (pub-sub) pattern. When an event is published, all subscribers who are interested in that type of event get notified and can react accordingly.
Event-Driven Architecture: It's often a part of an event-driven architecture where components react to events asynchronously. This leads to a loosely coupled and scalable system, where components operate independently based on events.
Event Types: The system typically supports different types of events, which can be categorized and filtered so that only specific subscribers handle relevant events.


We have to design a message Bus supporting publisher-subscriber model/Event bus.
It should support following operations:

1. It should support multiple topics where messages can be published.
2. Publisher should be able to publish a message to a particular topic.
3. Subscribers should be able to subscribe to a topic.
4. Whenever a message is published to a topic, all the subscribers, who are
   subscribed to that topic, should receive the message.
5. Subscribers should be able to run in parallel.

