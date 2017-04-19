# lift-reactjs

### A simple SPA with Lift 3 roundtrips and Facebook's ReactJs 

...Roundtrips?

**Lift 3** introduced the idea of Round Trips: a client-side request that's sent to the server where the client receives a Streaming Promise. 

The server performs its computations and when the results are ready, they get pushed to the client. 

If there are multiple results, they are pushed to the client when they become available.

