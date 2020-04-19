import Vue from 'vue'
import VueRouter from 'vue-router'

import AddBook from '../views/Page/AddBook'
import Book from '../views/Page/Book'

import Index from '../views/Index'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: '图书管理',
    component: Index,
    redirect: '/bookList',
    children: [
      {
        path: '/bookList',
        name: '图书展示',
        component: Book
      },
      {
        path: '/addBook',
        name: '添加图书',
        component: AddBook
      },
    ]
  },

]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
