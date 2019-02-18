(ns smallworldnew.components.aboutUs
  (:require [smallworldnew.components.navbars :refer [navbars]]
            [smallworldnew.states.news :refer [news]]
            [smallworldnew.states.news :refer [members]]
            [smallworldnew.states.news :refer [invester]]
            [smallworldnew.states.states :refer [aboutone]]))


(defn section1
  [id type title desc image]
  (if (= type 1)
    [:div.aboutsmall  {:key id}
      [:div.ui.container
          [:div {:class "ui stackable two column grid centerme"}
              [:div.column
                   [:h1 title]
                   [:p desc]
                   [:p desc]]
              [:div.column
                [:div.mobile
                  [:img {:src image}]]]]]]

    [:div.aboutsmall  {:key id}
      [:div.ui.container
          [:div {:class "ui stackable two column grid centerme"}
              [:div.column
                [:div.mobileimg
                  [:img {:src image}]]
                [:div.descTitle
                 [:h1 title]
                 [:p desc]
                 [:p desc]]]
              [:div.column
               [:div.descTitle1
                [:h1 title]
                [:p desc]
                [:p desc]]
               [:div.mobileimg1
                 [:img {:src image}]]]]]]))

(defn member
  []
  [:div.backMember
   [:div.ui.container
    [:center
      [:h1 "Our Board Member"]
      [:p "During the past five years, smallworld has worked side-by-side
      "[:br]"with emerging young business leaders, encouraging"]
      [:div {:class "ui stackable four column grid"}
       (map (fn [item]
                [:div.column {:key (:id item)}
                 [:a {:class "newsDetail"}
                     [:img {:src (:image item)  :class "ui fluid image "}]
                     [:h3 (:title item)]
                     [:p (:tag item)]]]) @members)]]]])

(defn team
  []
  [:div.teams
   [:div.ui.container
    [:center
      [:h1 "Our Teams"]
      [:p "During the past five years, smallworld has worked side-by-side
      "[:br]"with emerging young business leaders, encouraging"]
      [:div {:class "ui stackable four column grid"}
       (map (fn [item]
                [:div.column {:key (:id item)}
                 [:a {:class "newsDetail"}
                     [:img {:src (:image item)  :class "ui fluid image "}]
                     [:h3 (:title item)]
                     [:p (:tag item)]]]) @members)]]]])

(defn investor
    []
    [:div.investorfooter
      [:div.ui.container
       [:center
         [:h1 "Our Investor & Partner"]
         [:p "During the past five years, smallworld has worked side-by-side
         "[:br]"with emerging young business leaders, encouraging"]
         [:div.logome
          [:div {:class "ui three column grid"}
           (map (fn [item]
                    [:div.column.logo {:key (:id item)}
                     [:a {:class "newsDetail"}
                         [:img {:src (:image item)  :class "ui image"}]]])
               @invester)]]]]])

(defn aboutus
  []
  [:div
   [navbars]
   (map (fn [data]
            [section1 (:id data) (:type data) (:title data) (:desc data) (:image data)]) @aboutone)
   [member]
   [team]
   [investor]])
