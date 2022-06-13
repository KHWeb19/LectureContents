import 'dart:convert';

import '../model/KakaoPhoto.dart';
import 'kakao_photo_api_repository.dart';

// vue axios
import 'package:http/http.dart' as http;

// https://pub.dev/packages/http
class KakaoApi implements KakaoPhotoApiRepository {

  static const String restApiKey = "yourRestApiKey";
  static const baseUrl = 'https://dapi.kakao.com/v2/search/image';

  @override
  Future<List<KakaoPhoto>> fetchPhoto(String query, {http.Client? client}) async {
    client ??= http.Client();
    
    final response = await client.get(
      Uri.parse('$baseUrl?query=$query'),
      headers: {'Authorization': 'KakaoAK $restApiKey'}
    );

    Map<String, dynamic> jsonResponse = jsonDecode(response.body);
    print("response : $jsonResponse");

    Iterable documents = jsonResponse['documents'];
    return documents.map((e) => KakaoPhoto.fromJson(e)).toList();
  }
}