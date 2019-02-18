(ns smallworldnew.components.navbars
  (:require [smallworldnew.states.states :refer [mobileView, navData]]))

(defn closeMenu
  []
  (swap! mobileView assoc :view false))

(defn toggleMenu
  []
  (swap! mobileView assoc :view (not (get-in @mobileView [:view]))))

(defn mobileMenu []
  (if (get-in @mobileView [:view])
    [:div {:class "ui inverted vertical menu slideInDown animated"}
     [:center.moblenav
      [:a {:class "item" :href "/#" :onClick (fn [] (closeMenu))} "Home"]
      [:a {:class "item" :href "/about" :onClick (fn [] (closeMenu))} "About"]
      [:a {:class "item" :href "/wedo" :onClick (fn [] (closeMenu))} "What Can Do"]
      [:a {:class "item" :href "#" :onClick (fn [] (closeMenu))} "Events & News"]
      [:a {:class "item" :href "/contact" :onClick (fn [] (closeMenu))} "Contact Us"]]]
    ""))

(defn navbars
  []
  [:div
   [:div.hd
    [:center
     [:div {:class "ui secondary  menu navbars "}
      [:div.ui.container
         [:a {:class "navlogo" :href "/"}
           [:div
            [:img {:src "/images/logo/sw-green.png"}]]]
         [:div.menu.right.asizes
          (map (fn [nav]

                   [:a {:class (if (== (:path nav) (.. js/window -location -pathname)) "item active" "item")
                        :href (:path nav)}
                    (:name nav)]) @navData)]]]]]
   [:div.imenu
    [:i {:class "icon bars" :onClick (fn [] (toggleMenu))
              :style {:width "50px" :height "50px" :border "none" :background "none" :color "#fff" :position "absolute" :top "0" :left "0" :lineHeight "50px"}}]
    [mobileMenu]]])
