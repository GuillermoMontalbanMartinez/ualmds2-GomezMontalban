import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-reseñas`
 *
 * VistaReseñas element.
 *
 * @customElement
 * @polymer
 */
class VistaReseñas extends PolymerElement {

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
        return 'vista-reseñas';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaReseñas.is, VistaReseñas);
