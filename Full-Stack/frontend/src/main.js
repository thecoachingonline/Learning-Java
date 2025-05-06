import { createApp } from 'vue'
import App from './App.vue'

import axios from 'axios';

export default {
  data() {
    return {
      message: ''
    };
  },
  mounted() {
    this.fetchData();
  },
  methods: {
    async fetchData() {
      try {
        const response = await axios.get('http://localhost:8080/api/data'); // Replace with your backend API URL
        this.message = response.data.message;
      } catch (error) {
        console.error('Error fetching data:', error);
      }
    }
  }
};

createApp(App).mount('#app')
