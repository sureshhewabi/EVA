export class AppSettings {
  public static BASE_URI = 'http://localhost:8080';
  public static API_ENDPOINT = AppSettings.BASE_URI + '/api/v1';
  public static SHORTEN_TITLE_REGX = /^(.{0,50})\b.*/;
}
