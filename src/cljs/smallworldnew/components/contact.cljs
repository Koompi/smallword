(ns smallworldnew.components.contact
  (:require [smallworldnew.components.navbars :refer [navbars]]
            [smallworldnew.states.states :refer [accordionData]]))

(defn toggle
  [index]
  (swap! accordionData assoc-in [index :active] (not (get-in @accordionData [index :active])))

  (println (get-in @accordionData [0 :active])))

(defn accordion
  [index id title desc active]
  [:div {:class "ui accordion" :key id}
   [:div
    {:class (if active "title active" "title")
     :onClick (fn [] (toggle index))
     :key id}

    [:i {:class "dropdown icon"}]
    title]
   [:div {:class (if active "content active" "content")}
    [:p {:class "transition visible"
         :style {
                 :display "block !important"}
         :key id}
        desc]]])


(defn contact1
    []
    [:div.backcontact
      [:div.ui.container
          [:div {:class "ui stackable two column grid contact"}
              [:div.column.marginInformation
               [:h2 "Request e-Consulting"]
               [:form {:class "ui form"}
                [:div {:class "field"}
                  [:label "Your Name"]
                  [:input {:type "text", :name "yourName", :placeholder ""}]]
                [:div {:class "field"}
                  [:label "Name of company"]
                  [:input {:type "text", :name "companyName", :placeholder ""}]]
                [:div {:class "field"}
                  [:label "Your position in company"]
                  [:input {:type "text", :name "positionCompany", :placeholder ""}]]
                [:div {:class "field"}
                  [:label "Business e-mail"]
                  [:input {:type "text", :name "email", :placeholder ""}]]
                [:div {:class "field"}
                  [:label "Phone"]
                  [:input {:type "text", :name "email", :placeholder ""}]]
                [:button {:class "ui button right floated positive ", :type "submit"} "Submit"]]]
              [:div.column.marginInformation
                  [:h2 "Frequently asked questions"]

                  (map
                      (fn
                         [data]
                         [accordion (- (:id data) 1) (:id data) (:title data) (:desc data) (:active data)])
                      @accordionData)

                  [accordion "what is a dog?" "alksfgjnlkaglafhngoadhg;o"]

                  [:h5 [:i {:class ""} ]"Frequently asked questions"]
                  [:p "What is it like to run a business in Estonia? How to benefit from the e-solutions and the efficiency of our business culture? What are the opportunities in specific sectors?"]
                  [:p "What is it like to run a business in Estonia? How to benefit from the e-solutions and the efficiency of our business culture? What are the opportunities in specific sectors?"]]]]])


(defn findus
  []
  [:div
   [:div.mapsize
     [:div {:class "ui stackable two column grid"}
      [:div.column.backFineus
        [:div {:class "ui stackable two column grid"}
         [:div.column]
         [:div.column
          [:div.paddingsize
           [:h2 "Fine Us"]
           [:p "The Cambodia Investment Agency (EIA), a part of Enterprise Cambodia, is a goverment agency
            promoting foreign investments in Cambodia and assiting internal components in finding  business opportunities in Cambodia"]
           [:p "What is it like to run a business in Estonia? How to benefit from the e-solutions and the efficiency of our business culture? What are the opportunities in specific sectors?"]]]]]
      [:div.column.mapone
           [:iframe {:src "https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3908.6815969291333!2d104.89086411397015!3d11.574668047118776!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x31095176305bf04b%3A0x5029dc78a50975a0!2sSmallWorld+Venture!5e0!3m2!1skm!2skh!4v1549694899483"
                     :style {
                             :width "100%"
                             :height "400px"
                             :frameborder "0"
                             :border "none"
                             :allowfullscreen "true"}}]]]]])


(defn contact
  []
  [:div
   [navbars]
   [contact1]
   [findus]])
