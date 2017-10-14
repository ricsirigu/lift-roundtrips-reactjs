# lift-roundtrips-react

### A simple SPA with Lift 3 roundtrips and Facebook's React 16

...Roundtrips?

With Lift 3, we introduce the idea of Round Trips: a client-side request that's sent to the server where the client receives a Streaming Promise, the server performs its computations and when the results are ready, they get pushed to the client… and if there are multiple results, the multiple results are pushed to the client as the results become available.

David Pollak @dpp in  [Angular JS, Lift 3, and Streaming Promises](https://blog.goodstuff.im/roundtrip_promises)

### How to run

You need to have installed NodeJs and npm on your machine

Run sbt and type `cs` to start the Lift backend

Type `npm i` to download all the dependencies

Type `npm run watch` on your terminal to launch nodejs and webpack

Go to `localhost:8080`

Enjoy
