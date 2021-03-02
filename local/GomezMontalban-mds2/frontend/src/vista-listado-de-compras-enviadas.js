import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-compra-enviada.js';

class VistaListadoDeComprasEnviadas extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center;">
 <vaadin-horizontal-layout theme="spacing">
  <vaadin-horizontal-layout theme="spacing" style="margin-bottom: var(--lumo-space-xl);">
   <vista-compra-enviada></vista-compra-enviada>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="margin-bottom: var(--lumo-space-xl); margin-left: var(--lumo-space-xl); padding-left: var(--lumo-space-xl);">
   <vista-compra-enviada></vista-compra-enviada>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing">
  <vaadin-horizontal-layout theme="spacing">
   <vista-compra-enviada></vista-compra-enviada>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="margin-left: var(--lumo-space-xl); padding-left: var(--lumo-space-xl);">
   <vista-compra-enviada></vista-compra-enviada>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-listado-de-compras-enviadas';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaListadoDeComprasEnviadas.is, VistaListadoDeComprasEnviadas);
