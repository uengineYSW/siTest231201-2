<template>
    <v-card outlined>
        <v-card-title>
            RegisterMenu
        </v-card-title>

        <v-card-text>
            <String label="OwnerId" v-model="value.ownerId" :editMode="editMode"/>
            <String label="Menu" v-model="value.menu" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="registerMenu"
            >
                RegisterMenu
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
        name: 'RegisterMenuCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.ownerId = '';
            this.value.menu = '';
        },
        watch: {
        },
        methods: {
            registerMenu() {
                this.$emit('registerMenu', this.value);
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

