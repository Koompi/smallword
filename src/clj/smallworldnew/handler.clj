(ns smallworldnew.handler
  (:require
   [reitit.ring :as reitit-ring]
   [smallworldnew.middleware :refer [middleware]]
   [hiccup.page :refer [include-js include-css html5]]
   [config.core :refer [env]]))

(def mount-target
  [:div#app
   [:img {:src "/images/banner.png"}]])

(defn head []
  [:head
   [:meta {:charset "utf-8"}]
   [:title "SmallWorld Venture Invest in Cambodia"]

   [:meta {:name "viewport"
           :content "SmallWorld helps entrepreneurs test refine  design startup model  build and launch fast with small capital by providing a share workspace and a supporting community of like-mined people."}]

   [:meta {:name "viewport"
           :content "width=device-width, initial-scale=1"}]
   (include-css "https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.4.1/semantic.min.css")
   (include-css (if (env :dev) "/css/site.css" "/css/site.min.css"))])

(defn loading-page []
  (html5
   (head)
   [:body {:class "body-container"}
    mount-target
    (include-js "/js/app.js")]))

(defn index-handler
  [_request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body (loading-page)})

(def app
  (reitit-ring/ring-handler
   (reitit-ring/router
    [["/" {:get {:handler index-handler}}]
     ["/about" {:get {:handler index-handler}}]
     ["/wedo" {:get {:handler index-handler}}]
     ["/contact" {:get {:handler index-handler}}]])
   (reitit-ring/routes
    (reitit-ring/create-resource-handler {:path "/" :root "/public"})
    (reitit-ring/create-default-handler))
   {:middleware middleware}))
