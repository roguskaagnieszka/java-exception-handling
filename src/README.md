# Exceptions Implementation

This project demonstrates the implementation of exception handling in Java, including the use of custom exceptions and built-in exceptions. It consists of two main functionalities:

## Features

### 1. Handling `NullPointerException`
The `NullExceptionExample` class simulates a scenario where a `NullPointerException` is generated and handled in the `ThrowNullException` class. It includes:
- Simulating a `NullPointerException` by operating on a `null` object.
- Catching the exception and providing debugging details using `printStackTrace()`.

### 2. Custom Exception: `NotEnoughMoneyException`
The `NotEnoughMoneyException` class is a user-defined exception used in the `Account` class to handle insufficient funds during a transfer. It includes:
- An `Account` class with fields: `owner`, `balance`, and `accountNumber`.
- A `transfer` method that throws a `NotEnoughMoneyException` if the transfer amount exceeds the account balance.
- Handling both custom exceptions and unexpected exceptions in the `ThrowOwnException` class.

## Usage

1. Run the `ThrowNullException` class to observe the handling of a `NullPointerException`.
2. Run the `ThrowOwnException` class to simulate a transfer and observe the custom exception handling.
