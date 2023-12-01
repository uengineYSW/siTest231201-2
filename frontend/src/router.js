
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import OrderAndPaymentManagementOrderManager from "./components/listers/OrderAndPaymentManagementOrderCards"
import OrderAndPaymentManagementOrderDetail from "./components/listers/OrderAndPaymentManagementOrderDetail"

import MenuAndRestaurantManagementRestaurantManager from "./components/listers/MenuAndRestaurantManagementRestaurantCards"
import MenuAndRestaurantManagementRestaurantDetail from "./components/listers/MenuAndRestaurantManagementRestaurantDetail"

import DeliveryAndOrderStatusManagementDeliveryManager from "./components/listers/DeliveryAndOrderStatusManagementDeliveryCards"
import DeliveryAndOrderStatusManagementDeliveryDetail from "./components/listers/DeliveryAndOrderStatusManagementDeliveryDetail"

import SystemManagementAdministratorManager from "./components/listers/SystemManagementAdministratorCards"
import SystemManagementAdministratorDetail from "./components/listers/SystemManagementAdministratorDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/orderAndPaymentManagements/orders',
                name: 'OrderAndPaymentManagementOrderManager',
                component: OrderAndPaymentManagementOrderManager
            },
            {
                path: '/orderAndPaymentManagements/orders/:id',
                name: 'OrderAndPaymentManagementOrderDetail',
                component: OrderAndPaymentManagementOrderDetail
            },

            {
                path: '/menuAndRestaurantManagements/restaurants',
                name: 'MenuAndRestaurantManagementRestaurantManager',
                component: MenuAndRestaurantManagementRestaurantManager
            },
            {
                path: '/menuAndRestaurantManagements/restaurants/:id',
                name: 'MenuAndRestaurantManagementRestaurantDetail',
                component: MenuAndRestaurantManagementRestaurantDetail
            },

            {
                path: '/deliveryAndOrderStatusManagements/deliveries',
                name: 'DeliveryAndOrderStatusManagementDeliveryManager',
                component: DeliveryAndOrderStatusManagementDeliveryManager
            },
            {
                path: '/deliveryAndOrderStatusManagements/deliveries/:id',
                name: 'DeliveryAndOrderStatusManagementDeliveryDetail',
                component: DeliveryAndOrderStatusManagementDeliveryDetail
            },

            {
                path: '/systemManagements/administrators',
                name: 'SystemManagementAdministratorManager',
                component: SystemManagementAdministratorManager
            },
            {
                path: '/systemManagements/administrators/:id',
                name: 'SystemManagementAdministratorDetail',
                component: SystemManagementAdministratorDetail
            },



    ]
})
