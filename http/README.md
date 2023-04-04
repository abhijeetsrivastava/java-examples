# Http Example

Making an Http request using `HttlUrlConnection`

`java.net` package has the juice for making http requests.

## steps

1. Make a `HttpUrlConnection con`
2. Set the request method: GET, PUT, POST. Like `con.setRequestMethod("GET")`
3. Read the response anyway you like: BufferedReader, Json (jacksonXML) etc
