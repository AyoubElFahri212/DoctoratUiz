import { IAuthority, NewAuthority } from './authority.model';

export const sampleWithRequiredData: IAuthority = {
  name: '50f9c170-8003-44ee-8bb9-c948ab203f8d',
};

export const sampleWithPartialData: IAuthority = {
  name: 'd9b7ea2c-1d17-4f8b-b81b-56e9de4dd3c3',
};

export const sampleWithFullData: IAuthority = {
  name: '307c9ec5-8eb7-468e-b648-2464058f16ae',
};

export const sampleWithNewData: NewAuthority = {
  name: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
