import 'dart:async';

import 'package:sixth/data/kakao_photo_api_repository.dart';

import '../model/KakaoPhoto.dart';

class HomeViewModel {
  // 카카오 API를 호출하는 interface
  final KakaoPhotoApiRepository repository;

  // 앞으로 배치될 List<KakaoPhoto>에 대한 초기 형태를 설정했다 봐도 무방함
  final _kakaoPhotoStreamController = StreamController<List<KakaoPhoto>>()..add([]);

  // 게터(getter)의 역할
  Stream<List<KakaoPhoto>> get photoStream => _kakaoPhotoStreamController.stream;

  HomeViewModel(this.repository);

  // fetch(검색 쿼리) 형태로 동작하게됨
  Future<void> fetch(String query) async {
    print("query: $query");

    final result = await repository.fetchPhoto(query);
    _kakaoPhotoStreamController.add(result);
  }
}