import { createApp } from "vue";
import App from "./App.vue";
import router from "./router";

// Bootstrap CSS i JS
import "bootstrap/dist/css/bootstrap.css";
import "bootstrap-icons/font/bootstrap-icons.css";
import "bootstrap/dist/js/bootstrap.bundle.js";

// Bootstrap Vue
import { BootstrapVueNext } from "bootstrap-vue-next";
import "bootstrap-vue-next/dist/bootstrap-vue-next.css";

const app = createApp(App);

app.use(router);
app.use(BootstrapVueNext);

app.mount("#app");
