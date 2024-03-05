# CMS_Test

1. **Base Page Object:**
   - Develop a `BasePageObject` class that serves as the foundation for all page objects.
   - Include commonly used methods such as navigation, element visibility checks, and any shared functionalities.
   - Ensure that the `BasePageObject` class promotes code reusability and maintains a consistent approach throughout the test suite.

2. **Landing Page:**
   - Extend the `LandingPage` class from `BasePageObject`.
   - Leverage common methods from `BasePageObject` for navigation checks and shared functionalities.

3. **Register Functionality:**
   - Extend the `RegistrationPage` class from `BasePageObject`.
   - Utilize methods from `BasePageObject` for common actions like waiting for elements to load or verifying page URLs.

4. **Account Created:**
   - Extend the `AccountCreatedPage` class from `BasePageObject`.
   - Incorporate methods from `BasePageObject` for consistent navigation and element interaction across pages.

5. **Login Functionality:**
   - Extend the `LoginPage` class from `BasePageObject`.
   - Reuse methods from `BasePageObject` for common tasks, ensuring a standardized testing approach.

6. **Contact Functionality:**
   - Extend the `ContactPage` class from `BasePageObject`.
   - Integrate methods from `BasePageObject` to maintain uniformity in test case implementations.

7. **Logout Functionality:**
   - Extend the `LogoutPage` class from `BasePageObject`.
   - Employ methods from `BasePageObject` for shared actions, promoting consistency and reducing redundancy.

By incorporating a `BasePageObject`, you establish a framework for reusing essential methods across various pages, streamlining maintenance and ensuring a cohesive structure in your automation test suite for the testing website playground.
