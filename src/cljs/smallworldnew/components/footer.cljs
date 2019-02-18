(ns smallworldnew.components.footer)


(defn footerIcon
  [link img title]
  [:a {:href link}
    [:div {:class "ui header footerIcon"}
        [:img {:class "ui image  footerIcon", :src img}]
        [:div {:class "content "} title]]])

(defn footer
  []
  [:div.ft-background
   [:div.ui.container
    [:div.footer
       [:div {:class "ui stackable four column grid"}
             [:div.column
                [:div.ftsize
                   [:a {:href "#"}
                       [:p "Opportunities"]]
                   [:a {:href "#"}
                       [:p "News & events"]]
                   [:a {:href "#"}
                       [:p "Useful links"]]
                   [:a {:href "#"}
                       [:p "Contac Us"]]]]
             [:div.column
                   [:a {:href "#"}
                       [:p "Tern & Condition"]]
                   [:a {:href "#"}
                       [:p "Policy Uses"]]
                   [:a {:href "#"}
                       [:p "Legal System"]]]
             [:div.column]
             [:div.column
                (footerIcon "#" "/images/socialMedia/telegram.svg" "Telegram")
                (footerIcon "#" "/images/socialMedia/facebook.svg" "Facebook")
                (footerIcon "#" "/images/socialMedia/twitter.svg" "Twitter")]]

       [:div {:class "ui stackable four column grid centerme"}
             [:div.column ""]
             [:div.column ""]
             [:div.column ""]
             [:div.column
                [:center
                 [:img.imgfooter {:src "/images/logo/Logo_SW_Gray.png"}]]]]]]])
