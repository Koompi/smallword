(ns smallworldnew.components.wwcdo
  (:require [smallworldnew.components.navbars :refer [navbars]]
            [smallworldnew.states.states :refer [wedoData]]
            [smallworldnew.states.news :refer [logoInvestment]]))


(defn toggleModal
  [id]
  (swap! wedoData assoc-in [id :modal] (not (get-in wedoData [id :modal]))))
(defn closeModal
  [id]
  (swap! wedoData assoc-in [id :modal] false))

(defn readmore

  [id image title desc]
  [:div
   [:div {:class "ui standard modal transition visible active" :style {:display "block" :position "fixed" :top "25%" :left "25%"}}
    [:i {:class "close icon" :onClick (fn [] (closeModal id))}]
    [:div {:class "header"} "Profile Picture"]
    [:div {:class "image content"}
     [:div {:class "ui medium image"}
      [:img {:src image}]]
     [:div {:class "description"}
      [:div {:class "ui header"} title]
      [:p desc]]]
    [:div [:center
           [:div.pop
                [:div {:class "ui four column grid"}
                 (map (fn [item]
                          [:div.column {:key (:id item)}
                           [:a {:class "newsDetail"}
                               [:img {:src (:image item)  :class "ui image"}]]])
                     @logoInvestment)]]]]
    [:div {:class "actions"}
     [:div {:class "ui red deny button" :onClick (fn [] (closeModal id))} "Close"]]]])




(defn sections
  [id type title desc image link modal]
  (if (= type 1)
    [:div.backAbout {:key id}
      [:div.ui.container
          [:div {:class "ui stackable two column grid centerme"}
              [:div.column
                  [:h1 title]
                  [:p desc]
                  (if link [:button {
                                     :style {:background "none" :border "none"}
                                     :onClick (fn [] (toggleModal (- id 1)))}
                                    "Read more.." ""])]
              [:div.column
                [:div.mobile
                  [:img {:src image}]]]
              (if modal [readmore (- id 1) image title desc ] "")]]]
    [:div.backAbout {:key id}
      [:div.ui.container
          [:div {:class "ui stackable two column grid centerme"}
              [:div.column
                [:div.mobileimg
                  [:img {:src image}]]
                [:div.descTitle
                    [:h1 title]
                    [:p desc]
                    (if link [:a {:href link} "Read More.."] "")]]
              [:div.column
                [:div.descTitle1
                  [:h1 title]
                  [:p desc]
                  (if link [:button {
                                     :style {:background "none" :border "none" :cursor "pointer"}
                                     :onClick (fn [] (toggleModal (- id 1)))}
                             "Read more.." ""])]
                [:div.mobileimg1
                  [:img {:src image}]]]]
          (if modal [readmore (- id 1)  image title desc ] "")]]))

(defn wwcdo
  []
  [:div
   [:div
    [navbars]
    (map (fn [data]
            [sections (:id data) (:type data) (:title data) (:desc data) (:image data) (:link data) (:modal data)]) @wedoData)]])
