import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-ver-publicidad`
 *
 * VistaVerPublicidad element.
 *
 * @customElement
 * @polymer
 */
class VistaVerPublicidad extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
        `;
    }

    static get is() {
        return 'vista-ver-publicidad';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaVerPublicidad.is, VistaVerPublicidad);
