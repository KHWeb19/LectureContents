class KakaoPhoto {
  KakaoPhoto({
    required this.collection,
    required this.datetime,
    required this.displaySitename,
    required this.docUrl,
    required this.height,
    required this.imageUrl,
    required this.thumbnailUrl,
    required this.width
  });

  late final String collection;
  late final String datetime;
  late final String displaySitename;
  late final String docUrl;
  late final int height;
  late final int width;
  late final String imageUrl;
  late final String thumbnailUrl;

  KakaoPhoto.fromJson(Map<String, dynamic> json) {
    collection = json['collection'];
    datetime = json['datetime'];
    displaySitename = json['display_sitename'];
    docUrl = json['doc_url'];
    height = json['height'];
    width = json['width'];
    imageUrl = json['image_url'];
    thumbnailUrl = json['thumbnail_url'];
  }

  Map<String, dynamic> toJson() {
    final _data = <String, dynamic>{};
    _data['collection'] = collection;
    _data['datetime'] = datetime;
    _data['display_sitename'] = displaySitename;
    _data['doc_url'] = docUrl;
    _data['height'] = height;
    _data['width'] = width;
    _data['image_url'] = imageUrl;
    _data['thumbnail_url'] = thumbnailUrl;

    return _data;
  }

  @override
  bool operator ==(Object other) =>
      identical(this, other) ||
          other is KakaoPhoto &&
              runtimeType == other.runtimeType &&
              imageUrl == other.imageUrl;

  @override
  int get hashCode => imageUrl.hashCode;

  @override
  String toString() {
    return 'KakaoPhoto{collection: $collection, datetime: $datetime, displaySitename: $displaySitename, docUrl: $docUrl, height: $height, imageUrl: $imageUrl, thumbnailUrl: $thumbnailUrl, width: $width}';
  }
}