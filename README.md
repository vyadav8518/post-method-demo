# Spring Boot POST Method Demo

## Description
A Spring Boot application to evaluate the effectiveness of a POST method for handling various input data and error cases with validation and error handling.

## Features
- POST endpoint with input validation.
- Global exception handling and structured error responses.
- Comprehensive logging for debugging.

## Technologies
- Spring Boot, Spring Web, Spring Validation, Lombok, Maven.

## Prerequisites
- Java 17+, Maven 3.6+, Git.

## Setup and Run
1. Clone the repository:
   ```bash
   git clone https://github.com/vyadav8518/post-method-demo.git
   cd post-method-demo
   ```
   
2. Build the project:
   ```bash
   mvn clean install
   ```
   
3. Run the application:
   ```bash
   mvn spring-boot:run
   ```

## API Usage
- Endpoint: /api/submit-data
- Method: POST
- Request Body:
 ```json
        {
          "field1": "value1",
          "field2": "value2"
        }
 ```
Response: Success or structured error messages.

## Testing
Run tests with:

 ```bash
    mvn test
 ```

## License
### Distributed under the MIT License.
 ```vbnet 
    This version is concise, covering only the essential details required for setup, usage, and testing. Let me know if further refinement is needed!
 ```