import 'dart:async';

import 'package:sixth/data/kakao_photo_api_repository.dart';

import '../model/KakaoPhoto.dart';

class HomeViewModel {
  final KakaoPhotoApiRepository repository;

  final _kakaoPhotoStreamController = StreamController<List<KakaoPhoto>>()..add([]);

  Stream<List<KakaoPhoto>> get photoStream => _kakaoPhotoStreamController.stream;

  HomeViewModel(this.repository);

  Future<void> fetch(String query) async {
    print("query: $query");

    final result = await repository.fetchPhoto(query);
    _kakaoPhotoStreamController.add(result);
  }
}