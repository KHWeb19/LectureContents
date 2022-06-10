import 'package:sixth/model/KakaoPhoto.dart';

abstract class KakaoPhotoApiRepository {
  Future<List<KakaoPhoto>> fetchPhoto(String query);
}