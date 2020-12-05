// single pages
import homePage from '../view/pages/HomePage.vue'
import loginPage from '../view/pages/loginPage.vue'
import ItemSearchPage from '../view/pages/ItemSearchPage'
import ItemHomePage from '../view/pages/ItemHomePage'



export const routes = [
  {
    path: '/',
    name: 'homepage',
    component: homePage,
    meta: { title: 'title' }
  },
  {
    path: '/login',
    name: 'loginpage',
    component: loginPage,
    meta: { title: 'login' }
  },
  {
    path: '/product/home/:id',
    name: 'ItemHomePage',
    component: ItemHomePage,
    meta: { title: 'login' }
  },
  {
    path: '/product/search/:id',
    name: 'ItemSearchPage',
    component: ItemSearchPage,
    meta: { title: 'login' }
  },

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
