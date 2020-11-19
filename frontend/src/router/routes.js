// single pages
import homePage from '../view/pages/HomePage.vue'

import { routePropResolver } from './util'
import { DOMAIN_TITLE } from '../.env'

export const routes = [
  {
    path: '/',
    name: 'homepage',
    component: homePage,
    meta: { title: `${DOMAIN_TITLE} | home` }
  }
  // {
  //   path: '/news',
  //   name: 'news',
  //   component: newsPage,
  //   meta: { title: `${DOMAIN_TITLE} | news` },
  //   props: routePropResolver
  // },
  // {
  //   path: '/profile',
  //   component: profilePage,
  //   meta: { isAuth: true, title: `${DOMAIN_TITLE} | profile` },
  //   children: [
  //     {
  //       path: '',
  //       name: 'profile',
  //       component: profilePostsPage
  //     }
  //   ]
  // },
  // {
  //   path: '/login',
  //   name: 'login',
  //   component: loginPage,
  //   meta: { title: `${DOMAIN_TITLE} | login` }
  // },
  // {
  //   path: '*',
  //   component: notFoundPage,
  //   meta: { title: `${DOMAIN_TITLE} | not found` }
  // }
]
