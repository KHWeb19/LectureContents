import 'dart:convert';

import 'package:flutter/cupertino.dart';
import 'package:http/http.dart' as http;

class SpringApi {
  // mac or linux ===> ifconfig -a
  static const String httpUri = '192.168.30.141:7777';

  Future<UserLoginResponse> login(UserLoginRequest request) async {
    var client = http.Client();
    var data = { 'email': request.email, 'password': request.password };
    debugPrint(request.email);
    debugPrint(request.password);
    var body = json.encode(data);

    try {
      var response = await client.post(
        Uri.http(httpUri, '/flutter-test/login'),
        headers: { 'Content-Type': 'application/json' },
        body: body,
      );

      return UserLoginResponse(true);
    } finally {
      client.close();
    }
  }
}

class UserLoginResponse {
  bool? success;

  UserLoginResponse(this.success);
}

class UserLoginRequest {
  String email;
  String password;

  UserLoginRequest(this.email, this.password);
}