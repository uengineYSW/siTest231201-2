<template>
    <v-card outlined>
        <v-card-title>
            PlaceOrder
        </v-card-title>

        <v-card-text>
            <String label="CustomerId" v-model="value.customerId" :editMode="editMode"/>
            <String label="RestaurantId" v-model="value.restaurantId" :editMode="editMode"/>
            <Address offline label="DeliveryAddress" v-model="value.deliveryAddress" :editMode="editMode" @change="change"/>
            <String label="PaymentMethod" v-model="value.paymentMethod" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="placeOrder"
            >
                PlaceOrder
            </v-btn>
            
            <v-btn
                    color="primary"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'PlaceOrderCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.customerId = '';
            this.value.restaurantId = '';
            this.value.deliveryAddress = {};
            this.value.paymentMethod = '';
        },
        watch: {
        },
        methods: {
            placeOrder() {
                this.$emit('placeOrder', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

