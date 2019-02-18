(ns smallworldnew.components.index
  (:require [smallworldnew.states.news :refer [news]]
            [smallworldnew.states.ftbanner :refer [ftbanner]]
            [smallworldnew.components.bannerIndex :refer [bannerIndex]]))

(defn toggleModal
    [id]
    (swap! news assoc-in [id :modal] (not (get-in news [id :modal]))))

(defn closeModal
    [id]
    (swap! news assoc-in [id :modal] false))


(defn readmore

    [id image title tag]
    [:div
     [:div {:class "ui standard modal transition visible active" :style {:display "block" :position "fixed" :top "25%" :left "25%"}}
        [:i {:class "close icon" :onClick (fn [] (closeModal id))}]
        [:div {:class "header"} "Profile Picture"]
        [:div {:class "image content"}
         [:div {:class "ui medium image"}
          [:img {:src image}]]
         [:div {:class "description"}
          [:div {:class "ui header"} title]
          [:p tag]]]
        [:div [:center
                [:div.pop
                    [:div {:class "ui four column grid"}
                     (map (fn [item]
                             [:div.column {:key (:id item)}
                                 [:a {:class "newsDetail"}
                                     [:img {:src (:image item)  :class "ui image"}]]])
                         @news)]]]]
        [:div {:class "actions"}
         [:div {:class "ui red deny button" :onClick (fn [] (closeModal id))} "Close"]]]])


(defn bannerbutton
    []
    [:div.cvcolor
     [:div.ui.container.margin-top
         [:div {:class "ui stackable four column grid"}
          (map (fn [item]
                   [:div.column {:key (:id item)}
                    [:center
                     [:div {:class "newsDetailo"}
                         [:img {:src (:image item)}]
                         [:h4 (:title item)]
                         [:p (:tag item)]]]]) @ftbanner)]]])

(defn information
    []
    [:div.backInformation
      [:div.ui.container
          [:div {:class "ui stackable two column grid"}
              [:div.column
                  [:h1 "Need More Information?"]
                  [:p "What is it like to run a business in Estonia? How to benefit from the e-solutions and the efficiency of our business culture? What are the opportunities in specific sectors?"]
                  [:p "What is it like to run a business in Estonia?"]
                  [:button {:class "ui basic button btnInformation"} "CONTACT US"]]]]])


(defn newsAndEvents
    [id]
    [:div.ui.container.margin-buttons
        [:h2.newsAndEvent "News & Events"]
        [:div {:class "ui stackable four column grid"}
         (map (fn [item]
                  [:div.column {:key (:id item)}
                   [:a {:class "newsDetail" :href "#"}
                       [:img {:src (:image item)  :class "ui fluid image"}]
                       [:h3 (:title item)]
                       [:p (:tag item)]]]) @news)]])
[:button {:onClick (fn [] (toggleModal (1)))} "Hello word"]
(defn index
  []
  [:div
   [bannerIndex]
   [bannerbutton]
   [information]
   [newsAndEvents]])
