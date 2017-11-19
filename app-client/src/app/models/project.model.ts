export class Project {
  public id: string;
  public title: string;
  public description: string;
  public sourceType: string;
  public studyType: string;
  public evaCenterName: string;
  public centerName: string;
  public taxonomyId: number;

  constructor(id: string,
              title: string,
              description: string,
              sourceType: string,
              studyType: string,
              evaCenterName: string,
              centerName: string,
              taxonomyId: number) {
    this.id = id;
    this.title = title;
    this.description = description;
    this.sourceType = sourceType;
    this.studyType = studyType;
    this.evaCenterName = evaCenterName;
    this.centerName = centerName;
    this.taxonomyId = taxonomyId;
  }
}
