import { IUser } from './user.model';

export const sampleWithRequiredData: IUser = {
  id: 9512,
  login: 's8@B\\<t2pt',
};

export const sampleWithPartialData: IUser = {
  id: 8351,
  login: 'qVE',
};

export const sampleWithFullData: IUser = {
  id: 25362,
  login: 'S@YEpH\\Lr4c\\ha\\cM\\m9yCsir',
};
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
