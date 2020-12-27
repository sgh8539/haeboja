import axios from 'axios';

export function getDetailList(index){
  return axios.get(`/search/${index}`)
}
