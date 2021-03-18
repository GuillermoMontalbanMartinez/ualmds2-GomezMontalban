import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-banner-admin.js';
import './vista-filtro-por-categoria.js';
import './vista-productos-admin.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaAdministrador extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayoutAdministrador">
 <vaadin-vertical-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center; width: 100%; margin: var(--lumo-space-m);" id="vaadinVerticalLayoutAdministradorBannerVista">
  <vista-banner-admin style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center;" id="vistaBannerAdmin"></vista-banner-admin>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center; margin: var(--lumo-space-m); width: 100%;">
  <vista-filtro-por-categoria style="flex-shrink: 0; align-self: center;"></vista-filtro-por-categoria>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center; width: 100%; margin: var(--lumo-space-m);">
  <vista-productos-admin style="align-self: center; flex-shrink: 0; margin: var(--lumo-space-m);"></vista-productos-admin>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="flex-shrink: 0; align-self: center; margin: var(--lumo-space-m); width: 100%; justify-content: center; align-items: center;">
  <vaadin-button style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center;" theme="primary" id="vaadinButtonMostrarTodosLosProductos">
    Mostrar todos los productos 
  </vaadin-button>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-administrador';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaAdministrador.is, VistaAdministrador);
