![Message-Streams](readme/mstreams.png)

[![Build](https://github.com/jauntsdn/message-streams-futures-examples/actions/workflows/ci-build.yml/badge.svg)](https://github.com/jauntsdn/message-streams-futures-examples/actions/workflows/ci-build.yml)
### Message-Streams with CompletableFutures

Demo for [Message streams](https://github.com/jauntsdn/rsocket-jvm) - very fast GRPC-like & GRPC-compatible services 
on JVM with rich streaming models - using familiar, widespread non-streaming API - jdk's `CompletableFutures`. 

It complements [1 million streams](https://jauntsdn.com/post/rsocket-million-streams-2/) stress test report and [message-streams interop](https://github.com/jauntsdn/rsocket-jvm-interop-examples) example with  
common single request-reply model found within each REST API server.

Example showcases how to transfer java `CompletableFutures` over TCP, unix sockets, websockets-over-http2, 
or consume with GRPC clients.

Also It outlines some properties of `Message-Streams` based applications:

* Services,APIs / networking,runtime decoupling
* Tiny service Jar & app distribution size
* Fast startup / first request time
* Small memory footprint
* Instant startup / even smaller memory footprint with graalvm native image