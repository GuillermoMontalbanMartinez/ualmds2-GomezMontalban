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
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-vertical-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center; width: 100%; margin: var(--lumo-space-m);">
  <vista-banner-admin style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center;"></vista-banner-admin>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center; margin: var(--lumo-space-m); width: 100%;">
  <vista-filtro-por-categoria style="flex-shrink: 0; align-self: center;"></vista-filtro-por-categoria>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="flex-shrink: 0; align-self: center; align-items: center; justify-content: center; width: 100%; margin: var(--lumo-space-m);">
  <vista-productos-admin style="align-self: center; flex-shrink: 0; margin: var(--lumo-space-m);"></vista-productos-admin>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="flex-shrink: 0; align-self: center; margin: var(--lumo-space-m); width: 100%; align-items: center; justify-content: center;">
  <vaadin-button style="margin: var(--lumo-space-m); flex-shrink: 0; align-self: center;" theme="primary">
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
