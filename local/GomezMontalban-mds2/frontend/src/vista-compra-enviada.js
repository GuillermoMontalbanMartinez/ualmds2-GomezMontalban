import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';

class VistaCompraEnviada extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center; border: #ccc solid 2px; border-radius : 20px; justify-content: center;">
 <vaadin-horizontal-layout theme="spacing" style="margin-bottom: var(--lumo-space-m); margin-top: var(--lumo-space-m); align-items: center; justify-content: center; align-self: center; flex-shrink: 0; margin-right: var(--lumo-space-m); padding-right: var(--lumo-space-m); margin-left: var(--lumo-space-m); padding-left: var(--lumo-space-m);">
  <vaadin-horizontal-layout theme="spacing">
   <label style="align-self: center;">Número del pedido</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing">
   <vaadin-text-field></vaadin-text-field>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" style="margin-top: var(--lumo-space-s);">
  <vaadin-horizontal-layout theme="spacing" style="margin-bottom: var(--lumo-space-m);">
   <vaadin-horizontal-layout theme="spacing">
    <label style="align-self: center;">Nombre del cliente</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing">
    <vaadin-text-field></vaadin-text-field>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="margin-top: var(--lumo-space-s);">
  <vaadin-horizontal-layout theme="spacing" style="margin-left: var(--lumo-space-xs); margin-bottom: var(--lumo-space-m);">
   <vaadin-horizontal-layout theme="spacing">
    <label style="align-self: center;">Dirección</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="padding-left: var(--lumo-space-xl); margin-left: var(--lumo-space-xl);">
    <vaadin-text-field></vaadin-text-field>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="margin-top: var(--lumo-space-s);">
  <vaadin-horizontal-layout theme="spacing" style="margin-bottom: var(--lumo-space-m);">
   <vaadin-horizontal-layout theme="spacing">
    <label style="align-self: center;">Localidad</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="margin-left: var(--lumo-space-xl); padding-left: var(--lumo-space-xl);">
    <vaadin-text-field></vaadin-text-field>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="margin-top: var(--lumo-space-s);">
  <vaadin-horizontal-layout theme="spacing" style="margin-bottom: var(--lumo-space-m);">
   <vaadin-horizontal-layout theme="spacing">
    <label style="align-self: center;">Calle</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="padding-left: var(--lumo-space-xl); margin-left: var(--lumo-space-xl);">
    <vaadin-text-field style="margin-left: var(--lumo-space-xl); padding-left: var(--lumo-space-s);"></vaadin-text-field>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="margin-top: var(--lumo-space-s);">
  <vaadin-horizontal-layout theme="spacing" style="margin-bottom: var(--lumo-space-m);">
   <vaadin-horizontal-layout theme="spacing">
    <label style="align-self: center;">Portal</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="margin-left: var(--lumo-space-xl); padding-left: var(--lumo-space-xl);">
    <vaadin-text-field style="padding-left: var(--lumo-space-l);"></vaadin-text-field>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="margin-top: var(--lumo-space-s);">
  <vaadin-horizontal-layout theme="spacing" style="margin-bottom: var(--lumo-space-m);">
   <vaadin-horizontal-layout theme="spacing">
    <label style="align-self: center;">Provincia</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="margin-left: var(--lumo-space-xl); padding-left: var(--lumo-space-xl);">
    <vaadin-text-field></vaadin-text-field>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="margin-bottom: var(--lumo-space-l); margin-top: var(--lumo-space-s);">
  <vaadin-horizontal-layout theme="spacing">
   <vaadin-horizontal-layout theme="spacing">
    <label style="align-self: center;">Código postal</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="margin-left: var(--lumo-space-xl); padding-left: var(--lumo-space-xs);">
    <vaadin-text-field></vaadin-text-field>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }
    

    static get is() {
        return 'vista-compra-enviada';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaCompraEnviada.is, VistaCompraEnviada);
