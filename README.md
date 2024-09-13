# Logistiqo API

Welcome to the **Logistiqo API** – a public API designed to interact with the comprehensive **Transport Management System (TMS)** and **Warehouse Management System (WMS)**. The API also integrates with the **Personal Emergency Response System (PERS)**, providing a powerful and scalable platform for managing logistics, learning, and emergency services.

## Overview

The **Logistiqo API** allows external applications to seamlessly interact with the core functionalities of **Logistiqo's TMS and WMS**, as well as extensions like **PERS**. Whether you're managing shipments, tracking logistics, handling personal emergency responses, or building custom transport solutions, this API has everything you need to get started.

### Key Features
- **Public Access:** The API is publicly available at [Logistiqo API Swagger UI](https://api.logistiqo.com/swagger/index.html), providing a user-friendly interface with comprehensive documentation.
- **TMS Functionality:** Manage transport logistics, including creating shipments, tracking, routing, and managing logistics data.
- **PERS Integration:** Extend your systems with emergency response capabilities using the Personal Emergency Response System (PERS) integration.
- **Flexible and Scalable:** Suitable for both small and large-scale operations, offering flexibility across different use cases.
- **Comprehensive Documentation:** Explore the API's features, including authentication, endpoints, and transaction handling.

## Getting Started

### Base URL
```
https://api.logistiqo.com
```

### Authentication

To access the API, you'll need to authenticate using **API keys** or **OAuth tokens**. The detailed authentication process can be found in our [Swagger UI documentation](https://api.logistiqo.com/swagger/index.html).

### Example Request

To create a new shipment manifest, use the following endpoint:

**Endpoint:** `/logistiqo/rest/api/v-1/manifest/post`

**Method:** `POST`

#### Request Body Example:
```json
{
  "manifestId": "123456",
  "date": "2024-09-12",
  "shipments": [
    {
      "shipmentId": "SHIP123",
      "customerReference": "CUST456",
      "address": {
        "street": "123 Main St",
        "city": "Example City",
        "postcode": "12345",
        "country": "DE"
      },
      "goods": [
        {
          "goodsId": "GOODS001",
          "description": "Electronics",
          "quantity": 10,
          "weight": 5.0
        }
      ]
    }
  ]
}
```

#### Example Response:
```json
{
  "status": "success",
  "message": "Manifest created successfully",
  "manifestId": "123456"
}
```

### Error Handling

If the request fails, you will receive an appropriate error message, such as:

```json
{
  "status": "error",
  "message": "Invalid request data",
  "errorDetails": "The field 'date' is required."
}
```

## Available Endpoints

### TMS Endpoints:
- `/logistiqo/rest/api/v-1/manifest/post`: Create a new manifest.
- `/logistiqo/rest/api/v-1/shipment/get`: Retrieve shipment details.
- `/logistiqo/rest/api/v-1/tracking/status`: Get tracking information for a shipment.

### PERS Endpoints:
- `/logistiqo/rest/api/v-1/pers/call`: Submit a personal emergency call.
- `/logistiqo/rest/api/v-1/pers/status`: Get status updates on emergency responses.

For a full list of available endpoints, visit the [API documentation](https://api.logistiqo.com/swagger/index.html).

## Use Cases

1. **Transport and Shipment Management**: Easily create, track, and manage shipments using the TMS features.
2. **Emergency Response**: Integrate personal emergency systems to handle home emergency calls and responses.
3. **Warehouse Management**: Handle warehouse management and user interactions with the WMS functionality.

## Resources

- [Official API Documentation](https://api.logistiqo.com/swagger/index.html)
- [GitHub Repository](https://github.com/habatlogistiqocom/LogistiqoAPI)
- [Developer Support](mailto:support@logistiqo.com)

## Contributing

We welcome contributions! If you’d like to contribute, please follow the standard GitHub **fork and pull request** workflow:

1. Fork the repository
2. Create a new feature branch (`git checkout -b feature-branch`)
3. Commit your changes (`git commit -am 'Add new feature'`)
4. Push to the branch (`git push origin feature-branch`)
5. Create a pull request

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more details.

---
