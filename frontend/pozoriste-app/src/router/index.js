import { createRouter, createWebHistory } from "vue-router";
import LoginView from "@/views/LoginView.vue";
import TicketPurchaseView from "@/views/TicketPurchaseView.vue";
import SpectatorsView from "@/views/SpectatorsView.vue";
import RepertoryView from "@/views/RepertoryView.vue";

const routes = [
  {
    path: "/",
    name: "login",
    component: LoginView,
  },
  {
    path: "/purchase",
    name: "purchase",
    component: TicketPurchaseView,
  },
  {
    path: "/spectators",
    name: "spectators",
    component: SpectatorsView,
  },
  {
    path: "/repertory",
    name: "repertory",
    component: RepertoryView,
  },
];

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes,
});

export default router;
