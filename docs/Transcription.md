

# Transcription

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** |  |  [optional]
**orgId** | **Integer** |  |  [optional]
**fileAttachmentId** | **Integer** |  |  [optional]
**created** | **OffsetDateTime** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**mediaType** | [**MediaTypeEnum**](#MediaTypeEnum) |  |  [optional]
**contents** | **String** |  |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
SAVED | &quot;Saved&quot;
PROCESSING | &quot;Processing&quot;
COMPLETED | &quot;Completed&quot;
FAILEDWITHERROR | &quot;FailedWithError&quot;



## Enum: MediaTypeEnum

Name | Value
---- | -----
OTHER | &quot;Other&quot;
MP3 | &quot;Mp3&quot;
MP4 | &quot;Mp4&quot;
WAV | &quot;Wav&quot;
FLAC | &quot;Flac&quot;



